package EncapsulationAndAbstraction;

public class Book {
	private String name;
	private double price;
	Author author;
	private int qtyInStock;
	Book(String name,double price,int qtyInStock){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the qtyInStock
	 */
	public int getQtyInStock() {
		return qtyInStock;
	}


	/**
	 * @param qtyInStock the qtyInStock to set
	 */
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("Adventures of Sherlock Holmes", 250.54, 10000);
		
		System.out.println("Book name = " + obj.getName());
		System.out.println("Price = " + obj.getPrice());
		System.out.println("Quantity = " + obj.getQtyInStock());

	}

}
