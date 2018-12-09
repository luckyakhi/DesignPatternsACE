package ace.java.designpatterns.domain;


import java.util.Date;
import java.util.Objects;

public class Trade {
    private Date tradeDate;
    private String trader;
    private String product;
    private String counterParty;

    private Date settlementDate;
    public Trade(Date tradeDate, String trader, String product, String counterParty) {
        super();
        this.tradeDate = tradeDate;
        this.trader = trader;
        this.product = product;
        this.counterParty = counterParty;
    }
    public Date getTradeDate() {
        return tradeDate;
    }
    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }
    public String getTrader() {
        return trader;
    }
    public void setTrader(String trader) {
        this.trader = trader;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getCounterParty() {
        return counterParty;
    }
    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }
    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }
    public void displayCounterparty(){
        System.out.println(this.counterParty);
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeDate=" + tradeDate +
                ", trader='" + trader + '\'' +
                ", product='" + product + '\'' +
                ", counterParty='" + counterParty + '\'' +
                ", settlementDate=" + settlementDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return Objects.equals(tradeDate, trade.tradeDate) &&
                Objects.equals(trader, trade.trader) &&
                Objects.equals(product, trade.product) &&
                Objects.equals(counterParty, trade.counterParty) &&
                Objects.equals(settlementDate, trade.settlementDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tradeDate, trader, product, counterParty, settlementDate);
    }
}
