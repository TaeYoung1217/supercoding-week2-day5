package mission.UserManageSystem;

public class SuperUser extends ReviewerUser implements AdminRole {
    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers() {
        System.out.printf("슈퍼유저(%s)은 유저를 매니징 할 수 있습니다.\n", this.username);
    }

    @Override
    public void changeSettings() {
        System.out.printf("슈퍼유저(%s)은 세팅을 변경할 수 있습니다.\n", this.username);
    }
}
