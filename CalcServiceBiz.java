package Calculator.Model;

public class CalcServiceBiz implements ICalcService {
    @Override
    public NumberDTO add(NumberDTO number) {
        double result = number.getNum1() + number.getNum2();
        number.setResult(result);
        return number;
    }
    @Override
    public NumberDTO sub(NumberDTO number) {
        double result = number.getNum1() - number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO mul(NumberDTO number) {
        double result = number.getNum1() * number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO div(NumberDTO number) {
        // 예외 처리: 0으로 나눌 때 방지
        if (number.getNum2() != 0) {
            double result = (double) number.getNum1() / number.getNum2();
            number.setResult(result);
        } else {
            // 0으로 나누는 경우 예외 처리
            System.out.println("0으로 나눌 수 없습니다");
        }
        return number;
    }
}
