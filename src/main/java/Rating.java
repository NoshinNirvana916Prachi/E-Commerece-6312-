import java.util.List;

public class Rating {
    private String ratingId;
    private int stars;
    private String userId;
    private String productId;

    // Constructor
    public Rating(String ratingId, int stars, String userId, String productId) {
        this.ratingId = ratingId;
        setStars(stars); // Ensure stars are within the valid range
        this.userId = userId;
        this.productId = productId;
    }

    // Getters
    public String getRatingId() {
        return ratingId;
    }

    public int getStars() {
        return stars;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductId() {
        return productId;
    }

    // Setters
    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public void setStars(int stars) {
        if (stars >= 1 && stars <= 5) {
            this.stars = stars;
        } else {
            throw new IllegalArgumentException("Rating must be between 1 and 5 stars.");
        }
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Additional methods to handle constraints

    // Constraint 2: ReviewByPurchasingCustomer
    public boolean isValidReviewByPurchasingCustomer(Customer customer, List<Order> orders) {
        for (Order order : orders) {
            if (order.getCustomer().equals(customer) && order.getProductIds().contains(productId)) {
                return true;
            }
        }
        return false;
    }



    // Constraint 4: ReviewByOrderingCustomer
    public boolean isValidReviewByOrderingCustomer(Customer customer, List<Order> orders) {
        for (Order order : orders) {
            if (order.getCustomer().equals(customer) && order.getProductIds().contains(productId)) {
                return true;
            }
        }
        return false;
    }

    // Constraint 5: CannotDeleteIfOnlyReview
    public boolean isValidCannotDeleteIfOnlyReview(Product product, List<Review> reviews) {
        int count = 0;
        for (Review review : reviews) {
            if (review.getProductId().equals(productId)) {
                count++;
            }
        }
        return count > 1; // If count is greater than 1, it means there are multiple reviews for this product
    }

    // Constraint 6: ReviewAssociatedWithCustomerOrder
    public boolean isValidReviewAssociatedWithCustomerOrder(Customer customer, List<Order> orders) {
        for (Order order : orders) {
            if (order.getCustomer().equals(customer) && order.getProductIds().contains(productId)) {
                return true;
            }
        }
        return false;
    }
}

