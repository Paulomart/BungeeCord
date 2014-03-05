package net.md_5.bungee.api.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Event;

@Data
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
public class ServerConnectionFailedEvent extends Event implements Cancellable
{

    /**
     * Player with failed to Connect to Server
     */
    private final ProxiedPlayer player;
    /**
     * Server that was the last target
     */
    @NonNull
    private ServerInfo exTarget;
    /**
     * Cancelled state.
     */
    private boolean cancelled;
    
    /**
     * blub
     */
    private boolean dimensionChange;

    public ServerConnectionFailedEvent(ProxiedPlayer player, ServerInfo exTarget, boolean dimensionChange)
    {
        this.player = player;
        this.exTarget = exTarget;
        this.dimensionChange = dimensionChange;
    }
}
