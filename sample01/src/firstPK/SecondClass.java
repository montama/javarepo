package firstPK;

public class SecondClass {
	public static void main(String[] args){
		for(int j = 0;j<10;j++){
			for(int i=0;i< 10;i++){
				if (j%2 == 0){
					if (i%2 == 0){
						System.out.print("■");
					}else{
						System.out.print("　");
					}
				}else{
					if (i%2 == 1){
						System.out.print("■");
					}else{
						System.out.print("　");
					}
				}
			}
			System.out.println("");
		}
	}
}
