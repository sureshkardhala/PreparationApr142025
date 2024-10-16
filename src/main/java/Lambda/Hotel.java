package Lambda;

public class Hotel {
    public int price;
    public int rating;
    public HotelType hotelType;

    public Hotel(int price, int rating, HotelType hotelType){
        this.hotelType= hotelType;
        this.price= price;
        this.rating=rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
