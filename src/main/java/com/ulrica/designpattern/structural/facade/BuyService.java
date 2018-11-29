package com.ulrica.designpattern.structural.facade;

public class BuyService {

    private FinanceService financeService = new FinanceService();

    private StockService stockService = new StockService();

    private DeliverService deliverService = new DeliverService();

    public void buy(Item item) {
        financeService.reduceFinance(item);

        stockService.reduceStock(item);

        deliverService.deliver(item);
    }
}
