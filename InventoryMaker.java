import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryMaker {
	
	public static Inventory createInventory(String title, int rows) {
		Inventory inv = Bukkit.getServer().createInventory(null, rows*9, ChatColor.translateAlternateColorCodes('&', title));
		return inv;
	}
	
	public static ItemStack createItemStack(String name, Material material, int amount, int data) {
		ItemStack item = new ItemStack(material, amount, (short)data);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
		item.setItemMeta(itemmeta);
		return item;
	}
	
}
