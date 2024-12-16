package com.accutrak.toolbox.domain.commands.product;

import lombok.Getter;

@Getter
public class DeleteProductByProdCodeCommand implements ProductCommand{
    private String prodCode;

    public DeleteProductByProdCodeCommand(String prodCode) {
        this.prodCode = prodCode;
    }
}