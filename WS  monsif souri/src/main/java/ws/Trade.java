package ws;
public class Trade {
    private String tradeId;
    private String symbol;
    private int quantity;
    private double price;
    private long tradeTime;  // Time in milliseconds since epoch

    public Trade(String tradeId, String symbol, int quantity, double price, long tradeTime) {
        this.tradeId = tradeId;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.tradeTime = tradeTime;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(long tradeTime) {
        this.tradeTime = tradeTime;
    }
}

