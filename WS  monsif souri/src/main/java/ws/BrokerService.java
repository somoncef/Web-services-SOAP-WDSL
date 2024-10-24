package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebService(serviceName = "BrokerService")
public class BrokerService {
    private List<Trade> trades;

    public BrokerService() {
        this.trades = new ArrayList<>(List.of(
                new Trade("T001", "AAPL", 100, 150.5, System.currentTimeMillis()),
                new Trade("T002", "GOOGL", 50, 2750.0, System.currentTimeMillis()),
                new Trade("T003", "TSLA", 25, 700.2, System.currentTimeMillis()),
                new Trade("T004", "AMZN", 10, 3300.0, System.currentTimeMillis()),
                new Trade("T005", "MSFT", 75, 299.5, System.currentTimeMillis())
        ));
    }

    @WebMethod
    public Optional<Trade> getTradeById(@WebParam(name = "TradeID") String tradeId) {
        return trades.stream().filter(trade -> trade.getTradeId().equals(tradeId)).findFirst();
    }

    @WebMethod
    public boolean deleteTrade(@WebParam(name = "TradeID") String tradeId) {
        return trades.removeIf(trade -> trade.getTradeId().equals(tradeId));
    }

    @WebMethod
    public List<Trade> listTrades() {
        return trades;
    }
}
