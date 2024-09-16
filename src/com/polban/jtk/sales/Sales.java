package com.polban.jtk.sales; 
import java.text.DecimalFormat; 
// kelas sales untuk mengelola transaksi penjualan 
public class Sales { 
    private Product product; 
 
    //constructor 
    public Sales (Product product) { 
        this.product = product; 
    } 

    //metode untuk melakukan penjualan 
    public void sellProduct (int quantity) { 
        System.out.println("Memproses penjualan..."); 
        product.sellProduct(quantity); 
        System.out.println("Stok setelah penjualan: "+ product.getStock()); 
    }

    // metode untuk menambah stok produk 
    public void restockProduct (int quantity) {
        System.out.println("Menambahkan stok..."); 
        product.addStock(quantity); 
        System.out.println("Stok setelah penambahan: " + product.getStock()); 
    } 

    //metode untuk memperbarui harga produk 
    public void updateProductPrice(float newPrice){ 
        System.out.println("Memperbarui harga produk..."); 
        product.setPrice(newPrice); 
        DecimalFormat df = new DecimalFormat("#,###.00"); 
        System.out.println("Harga baru : "+ df.format(product.getPrice())); 
    }

}