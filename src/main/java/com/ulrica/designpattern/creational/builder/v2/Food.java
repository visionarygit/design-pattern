package com.ulrica.designpattern.creational.builder.v2;

import lombok.ToString;

@ToString
public class Food {
    private Double sweet;
    private Double salt;
    private Double vinegar;

    public Food(FoodBuilder foodBuilder) {
        this.salt = foodBuilder.salt;
        this.sweet = foodBuilder.sweet;
        this.vinegar = foodBuilder.vinegar;
    }

    public static class FoodBuilder {

        private Double sweet;
        private Double salt;
        private Double vinegar;

        public FoodBuilder sweet(double sweet) {
            this.sweet = sweet;
            return this;
        }

        public FoodBuilder salt(double salt) {
            this.salt = salt;
            return this;
        }

        public FoodBuilder vinegar(double vinegar) {
            this.vinegar = vinegar;
            return this;
        }

        public Food build(){
            return new Food(this);
        }
    }
}
