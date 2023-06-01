package store;

import java.util.Objects;
import java.util.logging.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.security.auth.login.LoginException;

import java.sql.Driver;
import java.util.*;

public class Store {
	private int id;
	private String name;
	private String game;
	private String genre;
	private double price;
	private boolean multiplayer;
	
	
	
	public Store() {
	System.out.println("Enter UserName: ");
	Scanner sc = new Scanner(System.in);
	String username = sc.nextLine();
	System.out.println("Enter Password: ");
	String password = sc.nextLine();
	
	
	
	
	
	
		
		
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isMultiplayer() {
		return multiplayer;
	}
	public void setMultiplayer(boolean multiplayer) {
		this.multiplayer = multiplayer;
	}
	@Override
	public int hashCode() {
		return Objects.hash(game, genre, id, multiplayer, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Objects.equals(game, other.game) && Objects.equals(genre, other.genre) && id == other.id
				&& multiplayer == other.multiplayer && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", game=" + game + ", genre=" + genre + ", price=" + price
				+ ", multiplayer=" + multiplayer + "]";
	}
	

}
