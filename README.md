# AdvancementAPI
[![CircleCI](https://circleci.com/gh/Roxeez/AdvancementAPI.svg?style=shield)](https://circleci.com/gh/Roxeez/AdvancementAPI) 
![GitHub last commit](https://img.shields.io/github/last-commit/Roxeez/AdvancementAPI)
![GitHub](https://img.shields.io/github/license/Roxeez/AdvancementAPI)

AdvancementAPI is library made to easily create Advancement for your server using built in Bukkit/Spigot API features.

## Example
**Creating root advancement unlocked by collecting 3 cobblestone**
```java
public class CobblestoneAdvancement implements AdvancementCreator {

    public static final String ID = "some_cobblestone";
    
    @Override
    public @NotNull Advancement create(@NotNull Context context) {
        
        Advancement advancement = new Advancement(context.getPlugin(), ID);

        advancement.display(x -> {
            x.title("Some Cobblestone");
            x.description("Get 3 cobblestone");
            x.background(BackgroundType.STONE);
            x.icon(Material.COBBLESTONE);
        });

        advancement.addCriteria("cobblestone", TriggerType.INVENTORY_CHANGED, condition -> {
            condition.hasItemMatching(item -> {
                item.is(Material.COBBLESTONE);
                item.count(3);
            });
        });
        
        return advancement;
    }

}
```  

**Creating child advancement of previous one unlocked by crafting a stone pickaxe**
```java
public class StonePickaxeAdvancement implements AdvancementCreator {

    public static final String ID = "stone_pickaxe";

    @Override
    public @NotNull Advancement create(@NotNull Context context) {

        Advancement advancement = new Advancement(context.getPlugin(), ID);

        advancement.parent(new NamespacedKey(context.getPlugin(), CobblestoneAdvancement.ID));

        advancement.display(x -> {
            x.title("Stone Pickaxe");
            x.description("Craft a stone pickaxe with your 3 cobblestone");
            x.icon(Material.STONE_PICKAXE);
        });

        advancement.addCriteria("pickaxe", TriggerType.INVENTORY_CHANGED, condition -> {
            condition.hasItem(Material.STONE_PICKAXE);
        });

        return advancement;
    }

}
```  

**Register previously created advancements**
```java
public class MyPlugin extends JavaPlugin {

    private final AdvancementManager manager = new AdvancementManager(this);

    @Override
    public void onEnable() {
        manager.register(new CobblestoneAdvancement());
        manager.register(new StonePickaxeAdvancement());
        
        manager.createAll();
    }

}
```
