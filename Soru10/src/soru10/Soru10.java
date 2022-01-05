package soru10;
public class Soru10 {
    public static void main(String[] args) {
        int map[][]={{0,0,1,0,0,1},{1,1,1,1,0,0},{1,0,1,0,1,0},{0,0,1,0,0,1},{1,1,0,1,0,1},{0,1,0,0,0,0}};
        int maxX=map[0].length;
        int maxY=map.length;
        int verifiedMap[][]= new int[maxY][maxX];
        for(int y=0;y<maxY;y+=maxY-1){
            for(int x=0;x<maxX;x++){
                if(map[y][x]==1) verifiedMap[y][x]=1;
            }
        }
        for(int x=0;x<maxX;x+=maxX-1){
            for(int y=0;y<maxY;y++){
                if(map[y][x]==1) verifiedMap[y][x]=1;
            }
        }
        String verifiedMapNew = "";
        String verifiedMapOld = "";
        for(int y=0;y<maxY;y++){
            for(int x=0;x<maxX;x++){
                verifiedMapNew+=verifiedMap[y][x]+" ";
            }
            verifiedMapNew+="\n";
        }
        while(!verifiedMapOld.equals(verifiedMapNew)) {
            verifiedMapOld=verifiedMapNew;
            verifiedMapNew="";
            for (int y = 0; y < maxY; y++) {
                for (int x = 0; x < maxX; x++) {
                    if (0 < y && y < maxY - 1 && 0 < x && x < maxX - 1) {
                        if (map[y][x] == 1) {
                            if      (verifiedMap[y][x+1]==1) verifiedMap[y][x]=1;
                            else if (verifiedMap[y][x-1]==1) verifiedMap[y][x]=1;
                            else if (verifiedMap[y+1][x]==1) verifiedMap[y][x]=1;
                            else if (verifiedMap[y-1][x]==1) verifiedMap[y][x]=1;
                        }
                    }
                }
            }
            for(int y=0;y<maxY;y++){
                for(int x=0;x<maxX;x++){
                    verifiedMapNew+=verifiedMap[y][x]+" ";
                }
                verifiedMapNew+="\n";
            }

        }
        System.out.print(verifiedMapNew);
    }
}
