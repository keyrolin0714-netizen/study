package Interface;
// 舞蹈老师
public class DanceTeacher implements Dance {
    // 舞蹈老师跳舞
    @Override
    public void dance() {
        System.out.println("舞蹈老师跳舞");
    }
}
