import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigD {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("65498732165498745698");
        BigInteger b = new BigInteger("65485275345777555412");
        BigInteger resultAdd = a.add(b);
        System.out.println("Сумма целых числел равна: " + resultAdd);
        BigInteger resultSub = a.subtract(b);
        System.out.println("Разница целых числел равна: " + resultSub);
        BigInteger resultMult = a.multiply(b);
        System.out.println("Произведение целых числел равно: " + resultMult);
        BigInteger resultDiv = a.divide(b);
        System.out.println("Деление целых числел равно: " + resultDiv);
        BigInteger resultRem = a.remainder(b);
        System.out.println("Остаток от деления целых числел равен: " + resultRem);


        BigDecimal c = new BigDecimal("65498732165498745698.231");
        BigDecimal d = new BigDecimal("65485275345777555412.423");
        BigDecimal resultAddDec = c.add(d);
        System.out.println("Сумма дробных числел равна: " + resultAddDec);
        BigDecimal resultSubDec = c.subtract(d);
        System.out.println("Разница дробных числел равна: " + resultSubDec);
        BigDecimal resultMultDec = c.multiply(d);
        System.out.println("Умножение дробных числел равно: " + resultMultDec);
        BigDecimal resultDivDec = c.divide(d, 9, RoundingMode.DOWN);
        System.out.println("Деление дробных числел равно: " + resultDivDec);
        BigDecimal resultRemDec = c.remainder(d);
        System.out.println("Остаток от деления дробных числел равен: " + resultRemDec);


        byte b1 = 125;
        byte b2 = 126;
        byte b3 = (byte) (b2 + b1);
        System.out.println("Сложение типа Byte: " + b3); // -5 Произошло переполнение памяти и начался отчет с нижней границы
        byte b4 = (byte) (b2 - b1);
        System.out.println("Вычитание типа Byte: " + b4);
        byte b5 = (byte) (b2 * b1);
        System.out.println("Умножение типа Byte: " + b5);
        byte b6 = (byte) (b2 / b1);
        System.out.println("Деление типа Byte: " + b6);


        short s1 = 32766;
        short s2 = 32765;
        short s3 = (short) (s2 + s1);
        System.out.println("Сложение типа Short: " + s3);
        short s4 = (short) (s2 - s1);
        System.out.println("Вычитание типа Short: " + s4);
        short s5 = (short) (s2 * s1);
        System.out.println("Умножение типа Short: " + s5);
        short s6 = (short) (s2 / s1);
        System.out.println("Деление типа Short: " + s6);


        int i1 = 2147483647;
        int i2 = 2147483646;
        int i3 = i2 + i1;
        System.out.println("Сложение типа Int: " + i3);
        int i4 = i2 - i1;
        System.out.println("Вычитание типа Int: " + i4);
        int i5 = i2 * i1;
        System.out.println("Умножение типа Int: " + i5);
        int i6 = i2 / i1;
        System.out.println("Деление типа Int: " + i6);


        long l1 = 9223372036854775806L;
        long l2 = 9223372036854775805L;
        long l3 = l1 + l2;
        System.out.println("Сложение типа Long: " + l3);
        long l4 = l2 - l1;
        System.out.println("Вычитание типа Long: " + l4);
        long l5 = l2 * l1;
        System.out.println("Умножение типа Long: " + l5);
        long l6 = l2 / l1;
        System.out.println("Деление типа Long: " + l6);


        float f1 = 9223372036854775805.8f;
        float f2 = 9223372036854775805.1243456F;
        float f3 = f1 + f2;
        System.out.println("Сложение типа Float: " + f3);
        float f4 = f2 - f1;
        System.out.println("Вычитание типа Float: " + f4);
        float f5 = f2 * f1;
        System.out.println("Умножение типа Float: " + f5);
        float f6 = f2 / f1;
        System.out.println("Деление типа Float: " + f6);


        double d1 = 9464589659223372036854775805.8D;
        double d2 = 98456879877989223372036854775805.1243456d;
        double d3 = d1 + d2;
        System.out.println("Сложение типа Double: " + d3);
        double d4 = d2 - d1;
        System.out.println("Вычитание типа Double: " + d4);
        double d5 = d2 * d1;
        System.out.println("Умножение типа Double: " + d5);
        double d6 = d2 / d1;
        System.out.println("Деление типа Double: " + d6);

        /*При выполнении арифметических операций примитивных типов данных по граничным значениям происходит
        переполнение объема выделенной примитивной памяти и новый отсчет начинается с нижней границы диапазона
        значений. По числам BigInteger значения ограничены только объемом памяти. */
    }
}
