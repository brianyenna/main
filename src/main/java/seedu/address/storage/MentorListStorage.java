package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyAddressBook;

/**
 * Represents a storage for {@link seedu.address.model.EntityList.MentorList}
 */
public interface MentorListStorage {
    /**
     * Returns the file path of the data file.
     */
    Path getMentorListFilePath();

    /**
     * Returns MentorList data as a {@link ReadOnlyMentorList}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyMentorList> readMentorList() throws DataConversionException, IOException;

    /**
     * @see #getMentorListFilePath()
     */
    Optional<ReadOnlyAddressBook> readMentorList(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyMentorList} to the storage.
     * @param mentorList cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveMentorList(ReadOnlyMentorList mentorList) throws IOException;

    /**
     * @see #saveMentorList(ReadOnlyMentorList)
     */
    void saveMentorList(ReadOnlyMentorList mentorList, Path filePath) throws IOException;
}

