import java.util.List;

public class Review {
    private String reviewId;
    private String title;
    private String content;
    private String userId;
    private String productId;

    // Constructor
    public Review(String reviewId, String title, String content, String userId, String productId) {
        this.reviewId = reviewId;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.productId = productId;
    }

    // Method to edit the review content
    public void editContent(String newContent) {
        this.content = newContent;
    }

    // Method to edit the review title
    public void editTitle(String newTitle) {
        this.title = newTitle;
    }

    // Method to delete the review (this would set the review's content to indicate it's been deleted)
    public void delete() {
        this.content = "This review has been deleted.";
    }

    // Getters and Setters
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    // Constraint 2: ReviewByPurchasingCustomer
    public boolean isValidReviewByPurchasingCustomer(Customer customer, List<Order> orders) {
    	int customerId = customer.getUserId();
        for (Order order : orders) {
            if (order.getUserId()==customerId && order.getProductId().contains(productId)) {
                return true;
            }
        }
        return false;
    }
     // Constraint 3: SingleProductReview
    public static boolean isSingleProductReview(List<Rating> ratings) {
        return ratings.stream().map(Rating::getProductId).distinct().count() == 1;
    }

    // Constraint 5: CannotDeleteIfOnlyReview
    public static boolean canDeleteReview(List<Rating> allRatings, Rating reviewToDelete) {
        String productIdToDelete = reviewToDelete.getProductId();
        long countReviewsForProduct = allRatings.stream().filter(r -> r.getProductId().equals(productIdToDelete)).count();
        return countReviewsForProduct > 1;
    }
}
