package seminar_07;

import java.util.logging.Logger;

public class Calculator {
    
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public Complex Add(Complex a, Complex b){
        logger.info("Сложение чисел");
        Complex resultadd =  a.Add(b);

        logger.info("Результат" + resultadd);

        return resultadd;
    }

    public Complex Multiply(Complex a, Complex b){
        logger.info("Умножение чисел");
        Complex resultmult =  a.Multiply(b);

        logger.info("Результат" + resultmult);

        return resultmult;
    }

    public Complex Divide(Complex a, Complex b){
        logger.info("Деление чисел");
        Complex resulltdiv = a.divide(b);

        logger.info("Результат" + resulltdiv);

        return resulltdiv;
    }
}

