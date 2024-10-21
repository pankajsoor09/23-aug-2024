package collection;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

//	public int compare(Object obj1, Object obj2) {
//		Product p1 = (Product) obj1;
//		Product p2 = (Product) obj2;
//		if (p1.getPid() > p2.getPid()) {
//			return 1;
//		} else if (p1.getPid() < p2.getPid()) {
//			return -1;
//		}
//		return 0;
//
//	}
	public int compare (Product p1, Product p2) {
		return p1.getPid()-p2.getPid();//only for int not to use with float
	}

}
