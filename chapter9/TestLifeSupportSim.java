
import java.util.ArrayList;

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for(int z = 0; z < 20; z ++) {
            RetentionBot ret = new RetentionBot (aList);
        }
    }
}
class SimUnit {
    String botType;
    SimUnit(String botType) {
        this.botType = botType;
    }
    int powerUse() {
        if("Тепловая машина".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
    public SimUnit(){
        System.out.println("Вывести на экран " + getClass());
    }
}
class V2Radiator {
    V2Radiator(ArrayList list) {
        for (int x =0; x < 5; x++) {
            list.add(new SimUnit("V2радиатор"));
        }
    }
}
class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList lglist) {
        super(lglist);  // ошибка!!!!
        for (int x =0; x < 10; x++) {
            lglist.add(new SimUnit("V3радиатор"));
        }
    }
}
class RetentionBot {
    RetentionBot(ArrayList rlist) {
        rlist.add(new SimUnit("Тепловая машина"));
    }
}
