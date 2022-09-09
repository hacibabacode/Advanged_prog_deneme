package final_adv;

public class BinaryImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
int[][] tBtI = {{255,0,0},{255,255,0},{255,255,255}};
int[][] xdir = {{-1,0,1},{-2,0,2},{-1,0,1}};
int[][] ydir = {{-1,-2,-1},{0,0,0},{1,2,1}};

int Gx = xdir[0][0]*tBtI[0][0]+xdir[1][0]*tBtI[1][0]+xdir[2][0]*tBtI[2][0]+
		xdir[0][2]*tBtI[0][2]+xdir[1][2]*tBtI[1][2]+xdir[2][2]*tBtI[2][2];

int Gy = ydir[0][0]*tBtI[0][0]+ydir[0][1]*tBtI[0][1]+ydir[0][2]*tBtI[0][2]+
		xdir[2][0]*tBtI[2][0]+xdir[2][1]*tBtI[2][1]+xdir[2][2]*tBtI[2][2];
System.out.println("Gx:  "+Gx);
System.out.println("Gy:  "+Gy);

System.out.println("magnitude:" +Math.sqrt(Gx*Gx+Gy*Gy));
System.out.println("orientation:" +Math.toDegrees(Math.atan(-Gy/Gx)));
*/