package Concepts.Interview;


public abstract class ExampleAbstarct {
	int getNum() {
		return 20;
	}
	abstract class BarClass{
		int getNum() {
			return 38;
		}
	}
	public static void main(String[] args) {
		ExampleAbstarct ea = new ExampleAbstarct() {
			int getNum() {
				return 25;
			}
		};
		ExampleAbstarct.BarClass bc = ea.new BarClass() {
			int getNum() {
				return 57;
			}
		};
		System.out.println(ea.getNum() + " " + bc.getNum());
	}
}
