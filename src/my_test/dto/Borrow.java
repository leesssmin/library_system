package my_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {
    private int id;
    private int bookId;
    private int studentId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

}
