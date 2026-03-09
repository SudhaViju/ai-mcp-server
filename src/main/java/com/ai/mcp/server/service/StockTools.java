package com.ai.mcp.server.service;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

@Component
public class StockTools {

    @McpTool(
            name = "getStockPrice",
            description = "Returns the current price of a stock symbol"
    )
    public String getStockPrice(
            @McpToolParam(description = "Stock ticker symbol like TSLA or AAPL")
            String symbol
    ) {

        if ("TSLA".equalsIgnoreCase(symbol)) {
            return "TSLA price is 205.25";
        }

        if ("AAPL".equalsIgnoreCase(symbol)) {
            return "AAPL price is 187.10";
        }

        return "Stock not supported";
    }
}
