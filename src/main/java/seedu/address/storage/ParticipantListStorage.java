package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyAddressBook;

/**
 * Represents a storage for {@link seedu.address.model.EntityList.TeamList}
 */
public interface ParticipantListStorage {
    /**
     * Returns the file path of the data file.
     */
    Path getParticipantListFilePath();

    /**
     * Returns ParticipantList data as a {@link ReadOnlyParticipantList}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyParticipantList> readParticipantList() throws DataConversionException, IOException;

    /**
     * @see #getParticipantListFilePath()
     */
    Optional<ReadOnlyAddressBook> readParticipantList(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyParticipantList} to the storage.
     * @param participantList cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveParticipantList(ReadOnlyParticipantList participantList) throws IOException;

    /**
     * @see #saveParticipantList(ReadOnlyParticipantList)
     */
    void saveParticipantList(ReadOnlyParticipantList participantList, Path filePath) throws IOException;
}

