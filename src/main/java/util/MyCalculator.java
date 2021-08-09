package util;

public final class MyCalculator {
    public String add(String num1, String num2){
//        return String.format("num1 + num2 = %d", getInt(num1) + getInt(num2));
        return "" + (getInt(num1) + getInt(num2));
    }
    public String sub(String num1, String num2){
//        return String.format("num1 - num2 = %d", getInt(num1) - getInt(num2));
        return "" + (getInt(num1) - getInt(num2));
    }
    public String multi(String num1, String num2){
//        return String.format("num1 * num2 = %d",  getInt(num1) * getInt(num2));
        return "" + (getInt(num1) * getInt(num2));
    }
    public String divide(String num1, String num2){
        return "" + (getInt(num1) / getInt(num2));
    }
    private Integer getInt(String num){
        return Integer.parseInt(num);
    }
}
