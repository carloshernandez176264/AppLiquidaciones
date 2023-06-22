package com.AppLiquidaciones.AppLiquidaciones.domain.model.exceptions;

public class ValidationException  extends IllegalArgumentException{

    public ValidationException(String message){
        super(message);
    }


}
