import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryMaker implements Listener {

    public static Inventory createInventory(String title, int rows) {
        Inventory inv = Bukkit.getServer().createInventory(null, rows * 9, Utilities.color(title));
        return inv;
    }

    public static ItemStack createItemStack(String name, List<String> lore, Material material, int amount, int data) {
        ItemStack item = new ItemStack(material, amount, (short) data);
        ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(Utilities.color(name));
        itemmeta.setLore(new Utilities().translateFromArray(lore));
        item.setItemMeta(itemmeta);
        return item;
    }

    public static ItemStack createItemStackWithoutLore(String name, Material material, int amount, int data) {
        ItemStack item = new ItemStack(material, amount, (short) data);
        ItemMeta itemmeta = item.getItemMeta();
        itemmeta.setDisplayName(Utilities.color(name));
        item.setItemMeta(itemmeta);
        return item;
    }
}
