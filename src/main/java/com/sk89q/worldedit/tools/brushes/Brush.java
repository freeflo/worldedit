// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
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

package com.sk89q.worldedit.tools.brushes;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.patterns.Pattern;

/**
 * Represents a brush.
 *
 * @author sk89q
 */
public interface Brush {
    /**
     * Build the object.
     * 
     * @param editSession
     * @param pos
     * @param mat
     * @param size
     * @throws MaxChangedBlocksException 
     */
    public void build(EditSession editSession, Vector pos, Pattern mat, double size)
            throws MaxChangedBlocksException;
}
