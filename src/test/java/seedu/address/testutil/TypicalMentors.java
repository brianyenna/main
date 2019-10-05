package seedu.address.testutil;

import seedu.address.model.entity.Email;
import seedu.address.model.entity.Id;
import seedu.address.model.entity.Name;
import seedu.address.model.entity.Phone;
import seedu.address.model.entity.PrefixType;
import seedu.address.model.entity.SubjectName;

public class TypicalMentors {
    public static final Mentor A = new Mentor(new Name("Mentor A"),
                                              new Id(PrefixType.M, 3)
                                              new Phone("91111111"),
                                              new Email("mentorA@gmail.com"),
                                              new Name("Organization A"),
                                              new SubjectName);

    public Mentor(
            Name name,
            Id id,
            Phone phone,
            Email email,
            Name organization,
            SubjectName subject
    )
    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").build();
}
