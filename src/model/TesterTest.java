package model;

public class TesterTest {
	public String[] test1(Tester tester){	//自分が親の場合の計算
		//ロン上がりとツモ上がりの2パターンを配列pointsに格納
		String[] points = new String[2];
		int oyako = Integer.parseInt(tester.getFu());
		int fu = Integer.parseInt(tester.getFu());
		int han = Integer.parseInt(tester.getHan());
		if(tester.getOyako().equals("1")){	//親の時
			switch(tester.getHan()){
				case "1":	//1翻の場合
					if(fu == 30){
						points[0] = "1500";
						points[1] = "500";
					}else if(fu == 40){
						points[0] = "2000";
						points[1] = "700";
					}else if(tester.getFu().equals("50")){
						points[0] = "2400";
						points[1] = "800";
					}else if(tester.getFu().equals("60")){
						points[0] = "2900";
						points[1] = "1000";
					}else if(tester.getFu().equals("70")){
						points[0] = "3400";
						points[1] = "1200";
					}else if(tester.getFu().equals("80")){
						points[0] = "3900";
						points[1] = "1300";
					}else if(tester.getFu().equals("90")){
						points[0] = "4400";
						points[1] = "1500";
					}else if(tester.getFu().equals("100")){
						points[0] = "4800";
						points[1] = "1600";
					}else if(tester.getFu().equals("110")){
						points[0] = "5300";
						points[1] = "1800";
					}
			}
		}
		return points;
	}

}

