package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyUserPrefs;
import seedu.address.model.UserPrefs;

import seedu.address.model.EntityList.TeamList;
import seedu.address.model.EntityList.IssueList;
import seedu.address.model.EntityList.ParticipantList;
import seedu.address.model.EntityList.MentorList;

public interface AlfredStorage extends UserPrefsStorage, TeamListStorage,
        ParticipantListStorage, IssueListStorage, MentorListStorage {

    //=========================== UserPrefs ===========================
    @Override
    Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    //=========================== TeamList ===========================
    @Override
    Path getTeamListFilePath();

    @Override
    Optional<ReadOnlyTeamList> readTeamList() throws DataConversionException, IOException;

    @Override
    void saveTeamList(ReadOnlyTeamList teamList) throws IOException;

    //=========================== ParticipantList ===========================
    @Override
    Path getParticipantListFilePath();

    @Override
    Optional<ReadOnlyParticipantList> readParticipantList() throws DataConversionException, IOException;

    @Override
    void saveParticipantList(ReadOnlyParticipantList participantList) throws IOException;

    //=========================== IssueList ===========================
    @Override
    Path getIssueListFilePath();

    @Override
    Optional<ReadOnlyIssueList> readIssueList() throws DataConversionException, IOException;

    @Override
    void saveIssueList(ReadOnlyIssueList issueList) throws IOException;

    //=========================== MentorList ===========================
    @Override
    Path getMentorListFilePath();

    @Override
    Optional<ReadOnlyMentorList> readMentorList() throws DataConversionException, IOException;

    @Override
    void saveMentorList(ReadOnlyMentorList mentorList) throws IOException;
}