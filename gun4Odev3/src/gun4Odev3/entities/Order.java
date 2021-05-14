package gun4Odev3.entities;

import gun4Odev3.abstracts.Entity;

public class Order implements Entity{

		int id;
		int gamerId;
		int gameId;
		double totalAmount;
		
		public Order() {
			
		}
		
		
		public Order(int id, int gamerId, int gameId, double totalAmount) {
			super();
			this.id = id;
			this.gamerId = gamerId;
			this.gameId = gameId;
			this.totalAmount = totalAmount;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getGamerId() {
			return gamerId;
		}


		public void setGamerId(int gamerId) {
			this.gamerId = gamerId;
		}


		public int getGameId() {
			return gameId;
		}


		public void setGameId(int gameId) {
			this.gameId = gameId;
		}


		public double getTotalAmount() {
			return totalAmount;
		}


		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}


}