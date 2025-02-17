/*
 * LibertyBans
 * Copyright © 2021 Anand Beh
 *
 * LibertyBans is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * LibertyBans is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with LibertyBans. If not, see <https://www.gnu.org/licenses/>
 * and navigate to version 3 of the GNU Affero General Public License.
 */

package space.arim.libertybans.core.commands.extra;

import space.arim.libertybans.api.Operator;
import space.arim.libertybans.api.Victim;
import space.arim.libertybans.core.env.CmdSender;
import space.arim.omnibus.util.concurrent.CentralisedFuture;

import java.util.UUID;

public interface ArgumentParser {

	CentralisedFuture<UUID> parseOrLookupUUID(CmdSender sender, String targetArg);

	CentralisedFuture<Victim> parseVictim(CmdSender sender, String targetArg, ParseVictim how);

	CentralisedFuture<Operator> parseOperator(CmdSender sender, String operatorArg);
	
}
