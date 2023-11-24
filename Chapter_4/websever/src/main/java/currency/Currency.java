package currency;

public class Currency {
    double usd = 0.033;
    double jpn = 4.5;

    private int amount;
//    int amount = Integer.parseInt(request.getParameter("amount"));

    public Currency(int amount) {
        this.amount = amount;
    }

    public double getUsd() {
        return amount * usd;
    }

    public double getJpn() {
        return amount * jpn;
    }
}
