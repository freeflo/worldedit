/*
 * WorldEdit
 * Copyright (C) 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.bukkit.util;

import com.sk89q.minecraft.util.commands.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;

/**
* @author zml2008
*/
public class DynamicPluginCommand extends org.bukkit.command.Command {

    protected final Plugin plugin;

    public DynamicPluginCommand(Command command, Plugin plugin) {
        super(command.aliases()[0], command.desc(), command.usage(), Arrays.asList(command.aliases()));
        this.plugin = plugin;
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        return plugin.onCommand(sender, this, label, args);
    }
    
    public Plugin getPlugin() {
        return plugin;
    }
}
