package Calculator.Model;

public interface ICalcService {
    NumberDTO add(NumberDTO numberDTO);
    NumberDTO sub(NumberDTO numberDTO);
    NumberDTO mul(NumberDTO numberDTO);
    NumberDTO div(NumberDTO numberDTO);
    NumberDTO rem(NumberDTO numberDTO);
    //NumberDTO root(NumberDTO numberDTO);
}
