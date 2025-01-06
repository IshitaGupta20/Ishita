package Package;
public class Arithmetic {
    public int Sum(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public int Sub(int d,int e)
	{
		int f = d-e;
		return f;
	}
	public int Mul(int g,int h)
	{
		int i= g*h;
		return i;
	}
	public void Div(int j,int k)
	{
		int l = j/k;
	System.out.println("Final Result = " +l);
	}
	public static void main(String[] args) {
		Arithmetic cal= new Arithmetic();
		System.out.println("Calculation for Assignment 1: (((((10+2)+2)-2)*2)/2)");
		int resultSum = cal.Sum(10, 2);
		int resultSum1 = cal.Sum(resultSum,2);
		int resultSub = cal.Sub(resultSum1, 2);
		int resultMul = cal.Mul(resultSub, 2);
		cal.Div(resultMul, 2);
		System.out.println("Calculation for Assignment 2: (((((10*2)-2)+2)-2)/2)");
		int aresultMul = cal.Mul(10, 2);
		int aresultSub = cal.Sub(aresultMul,2);
		int aresultSum = cal.Sum(aresultSub,2);
		int aresultSub2 = cal.Sub(aresultSum,2);
		cal.Div(aresultSub2,2);
;
		
	}

}
