package mission.UserManageSystem;

public class ReviewerUser extends GeneralUser implements CustomerRole, ReviewerRole {
    public ReviewerUser(String username) {
        super(username);
    }

    @Override
    public void writeReview() {
        System.out.println("ReviewRole을 맡아서 리뷰 작성할 수 있습니다.");
    }

    @Override
    public void giveRating() {
        System.out.println("ReviewRole을 맡아서 점수 평가할 수 있습니다.");
    }
}
