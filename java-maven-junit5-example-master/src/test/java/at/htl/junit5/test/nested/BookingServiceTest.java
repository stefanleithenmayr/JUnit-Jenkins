package at.htl.junit5.test.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class BookingServiceTest {

    private BookingService bookingService = null;

    @BeforeEach
    public void init() {

        bookingService = new BookingService();
    }

    @Test
    void booking_success() {
    }

    @Test
    void booking_insufficient() {
    }

    @Test
    void booking_soldout() {
    }

    @Test
    void history() {
    }

    @Test
    void history_nodata() {
    }

    // Nested class Book -------------------------------------------
    @Nested
    class Book{
        @Test
        @DisplayName("booking success / 预定成功")
        void booking_success() {
        }

        @Test
        @DisplayName("booking insufficient / 预定金不足")
        void booking_insufficient() {
        }

        @Test
        @DisplayName("booking soldout / 预定售罄")
        void booking_soldout() {
        }
    }

    // Nested class History -----------------------------------------
    @Nested
    class History{
        @Test
        @DisplayName("booking history / 预定记录")
        void history() {
        }

        @Test
        @DisplayName("booking history / 无预定记录")
        void history_nodata() {
        }
    }
}