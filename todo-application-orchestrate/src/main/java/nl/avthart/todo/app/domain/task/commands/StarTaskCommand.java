package nl.avthart.todo.app.domain.task.commands;

import lombok.Value;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * @author albert
 */
@Value
public class StarTaskCommand {

	@TargetAggregateIdentifier
	private final String id;
}
