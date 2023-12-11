package Calculator.Model;

public class CalcController {
    ICalcService service;
    public CalcController(ICalcService service) {
        this.service = service;
    }
    public void applicationStart() {
        CalcView view = new CalcView();
        while (true) {
            NumberDTO number = new NumberDTO();
            String operator = view.inputNumber(number);

            if (operator.equals("E")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            NumberDTO result = calculateResult(number, operator);
            view.printResult(result, operator);
        }
    }
    private NumberDTO calculateResult(NumberDTO number, String operator) {
        switch (operator) {
            case "+":
                return service.add(number);
            case "-":
                return service.sub(number);
            case "*":
                return service.mul(number);
            case "/":
                return service.div(number);
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                return new NumberDTO();
        }
    }
}
