package my_test.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private String isbn;
    private boolean available;
}
