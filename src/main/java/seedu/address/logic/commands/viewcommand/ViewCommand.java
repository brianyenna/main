package seedu.address.logic.commands.viewcommand;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.Command;
import seedu.address.model.entity.Entity;
import seedu.address.model.entity.Id;

/**
 * Shows detailed view of the {@link Entity} at specified ID.
 */
public abstract class ViewCommand extends Command {

    /* Possible Fields */
    public static final String COMMAND_WORD = "view";

    protected Id id;

    ViewCommand(Id id) {
        requireNonNull(id);
        this.id = id;
    }

}
