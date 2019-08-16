import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utilities {

	public static void sendConsole(String message) {
		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
	}

	public static void broadcast(String message) {
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', message));
	}

	public static String color(String text) {
		return ChatColor.translateAlternateColorCodes('&', text);
	}

	public static void clearchat() {
		for (int i = 0; i < 100; i++) {
			broadcast("");
		}
	}

	public List<String> translateFromArray(List<String> text) {
		List<String> messages = new ArrayList<String>();
		for (String string : text) {
			messages.add(this.translateFromString(string));
		}
		return messages;
	}

	public String translateFromString(String text) {
		return StringEscapeUtils.unescapeJava(ChatColor.translateAlternateColorCodes('&', text));
	}
}
