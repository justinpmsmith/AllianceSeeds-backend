package com.accutrak.toolbox.presentation.resources;

import com.accutrak.toolbox.domain.commands.product.*;
import com.accutrak.toolbox.domain.entities.Product;
import com.accutrak.toolbox.services.MessageBus;
import com.accutrak.toolbox.services.Transformer;
import org.springframework.stereotype.Component;

@Component
public class ProductResource extends BaseResource{
    public ProductResource(MessageBus messageBus) {
        super(messageBus);
    }

    public Transformer addProduct(Product product){
        AddProductCommand command = new AddProductCommand(product);
        return messageBus.publishCommand(command);
    }

    public Transformer deleteProductByProdCode(String prodCode){
        DeleteProductByProdCodeCommand command = new DeleteProductByProdCodeCommand(prodCode);
        return messageBus.publishCommand(command);
    }

    public Transformer updateProduct(Product product){
        UpdateProductCommand command = new UpdateProductCommand(product);
        return messageBus.publishCommand(command);
    }

    public Transformer getProductsByCategory(String category){
        GetProductsByCategoryCommand command = new GetProductsByCategoryCommand(category);
        return messageBus.publishCommand(command);
    }

    public Transformer getAllProducts(){
        GetAllProductsCommand command = new GetAllProductsCommand();
        return messageBus.publishCommand(command);
    }

    public Transformer deleteProductByCategory(String category){

        DeleteProductsByCategoryCommand command = new DeleteProductsByCategoryCommand(category);
        return messageBus.publishCommand(command);
    }
}