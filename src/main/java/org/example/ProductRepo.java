package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<ProductRecord> products;

    public ProductRepo() {
        this.products = new ArrayList<>();
    }

    //add new a new product with quantity 1 or more
    public void addProduct(ProductRecord product) {
        int indexOfProduct= this.products.indexOf(product);
        if(indexOfProduct== -1){
            products.add(product);
        } else {
            ProductRecord existingProduct= this.products.get(indexOfProduct);
            ProductRecord updatedProduct=new ProductRecord(
                    existingProduct.id(),
                    existingProduct.name(),
                    existingProduct.brand(),
                    existingProduct.price(),
                    existingProduct.stockQuantity()+product.stockQuantity(),
                    existingProduct.category(),
                    existingProduct.description(),
                    existingProduct.imageUrl()
            );
            // Replace the old product with the updated one
            this.products.set(indexOfProduct, updatedProduct);
        }
    }

    public void addProducts(List<ProductRecord> newProducts) {
       for(ProductRecord product: newProducts){
           addProduct(product);
       }
    }

    public List<ProductRecord> getProducts() {
        return products;
    }

    public void setProducts(List<ProductRecord> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    public int getSize(){
        return this.products.size();
    }
    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
