package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyAddressBook;

/**
 * Represents a storage for {@link seedu.address.model.EntityList.IssueList}
 */
public interface IssueListStorage {
    /**
     * Returns the file path of the data file.
     */
    Path getIssueListFilePath();

    /**
     * Returns IssueList data as a {@link ReadOnlyIssueList}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyIssueList> readIssueList() throws DataConversionException, IOException;

    /**
     * @see #getIssueListFilePath()
     */
    Optional<ReadOnlyAddressBook> readIssueList(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyIssueList} to the storage.
     * @param issueList cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveIssueList(ReadOnlyIssueList issueList) throws IOException;

    /**
     * @see #saveIssueList(ReadOnlyIssueList)
     */
    void saveIssueList(ReadOnlyIssueList issueList, Path filePath) throws IOException;
}

