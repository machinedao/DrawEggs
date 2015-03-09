package org.machinegamez.zz;

/*
 * 由于内部类可以直接访问其外部类的成分，
 * 因此当内部类与其外部类中存在同名属性或方法时，也将导致命名冲突。所以在多层调用时要指明
 */
public class TryInnerNameConflict {
	public static void main(String[] args) {
		TryInnerNameConflict tryInner2 = new TryInnerNameConflict();
		Inner inner = tryInner2.new Inner();
		inner.dostuff(5);
	}
	    private int size = 100;
	    public class Inner{
	        private int size = 10;
	        public void dostuff(int size){
	            size++;  // 局部变量 size;
	            this.size++;  // 内部类的 size
	            TryInnerNameConflict.this.size++;  // 外部类的 size
	            System.out.println("parameter size = " + size);	// 输出 6
	            System.out.println("this.size = " + this.size);	// 输出 11
	            System.out.println("TryInner2.this.size = " + TryInnerNameConflict.this.size);  // 输出 101
	        }
	    }
}
